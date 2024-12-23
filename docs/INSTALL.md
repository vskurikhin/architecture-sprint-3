# Базовая настройка

## Запуск minikube

[Инструкция по установке](https://minikube.sigs.k8s.io/docs/start/)

```bash
minikube start
```


## Добавление токена авторизации GitHub

[Получение токена](https://github.com/settings/tokens/new)

```bash
kubectl create secret docker-registry ghcr --docker-server=https://ghcr.io --docker-username=<github_username> --docker-password=<github_token> -n default
```


## Установка API GW kusk

[Install Kusk CLI](https://docs.kusk.io/getting-started/install-kusk-cli)

```bash
kusk cluster install
```


## Настройка terraform

[Установите Terraform](https://yandex.cloud/ru/docs/tutorials/infrastructure-management/terraform-quickstart#install-terraform)


Создайте файл ~/.terraformrc

```hcl
provider_installation {
  network_mirror {
    url = "https://terraform-mirror.yandexcloud.net/"
    include = ["registry.terraform.io/*/*"]
  }
  direct {
    exclude = ["registry.terraform.io/*/*"]
  }
}
```

## Применяем terraform конфигурацию 

```bash
cd terraform
terraform apply
```

## При возникновении ошибки:
```
Error: found in Chart.yaml, but missing in charts/ directory: postgresql
│ 
│   with helm_release.smart-home-management,
│   on smart-home-management.tf line 1, in resource "helm_release" "smart-home-management":
│    1: resource "helm_release" "smart-home-management" {
```
выполнить:
```bash
helm dependency update
```

## Настройка API GW

```bash
kusk deploy -i api.yaml
```

## Проверяем работоспособность

```bash
$ kubectl port-forward svc/kusk-gateway-envoy-fleet -n kusk-system 8080:80
Forwarding from 127.0.0.1:8080 -> 8080
Forwarding from [::1]:8080 -> 8080
Handling connection for 8080
Handling connection for 8080

$ curl -X POST -H 'Content-Type: application/json' -d'{"login":"test","password":"secret"}' localhost:8080/api/v1/login/test
{"login":"test","password":"secret"}

$ curl -X GET -H 'Accept: application/json'  localhost:8080/api/v1/devices/1
{"id":null,"targetTemperature":0.0,"currentTemperature":0.0,"on":false}

$ curl -X GET -H 'Accept: application/json'  localhost:8080/api/v1/telemetry/devices/1/latest
{"id":1,"targetTemperature":0.0,"currentTemperature":0.0,"on":false}
```


## Delete minikube

```bash
minikube delete
```

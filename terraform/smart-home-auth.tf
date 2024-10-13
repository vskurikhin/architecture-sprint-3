resource "helm_release" "smart-home-auth" {
  name       = "smart-home-auth"
  namespace  = "default"
  chart      = "../charts/smart-home-auth"
}

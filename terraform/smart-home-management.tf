resource "helm_release" "smart-home-management" {
  name       = "smart-home-management"
  namespace  = "default"
  chart      = "../charts/smart-home-management"
}

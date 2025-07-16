argocd app create spring-api \
  --repo https://github.com/pablogonzalezr001/spring-api \
  --path k8s \
  --dest-server https://kubernetes.default.svc \
  --dest-namespace default

Demo project for trying out buildpacks

No Dockerfile needed, just run 
```bash
mvn spring-boot:build-image
```

After creating an image to start container just run
```bash
docker run -p 8080:8080 -d --name buildpack-demo buildpack-demo:0.0.1-SNAPSHOT
```
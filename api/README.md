### For Backend

- JDK 17 Require
- Gradle Require

```
cd api
```

Create Database:
```
docker run --name postgres-0 -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres
```
Run Command:
```
gradle bootRun
```

[Postman Collection](https://github.com/sametakbal/tutorials/blob/master/lecture-management/Lecture%20Management.postman_collection.json)

### For Frontend

```
cd frontend
```
Load node_modules:
```
npm install
```
Run Command:
```
npm start
```

![Ekran görüntüsü 2024-12-24 100459](https://github.com/user-attachments/assets/5103f1ec-0609-4558-8381-20c9102b9980)






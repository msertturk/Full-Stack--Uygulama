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
![Ekran görüntüsü 2024-12-24 100129](https://github.com/user-attachments/assets/a619f66e-5241-4fcf-955d-40e1d0a9baed)

![Ekran görüntüsü 2024-12-24 100156](https://github.com/user-attachments/assets/908db3f8-217e-4040-bc50-0728bac6a9f9)

![Ekran görüntüsü 2024-12-24 101450](https://github.com/user-attachments/assets/3a319ec8-5690-4ea2-90e6-0ea79fa9148f)

![Ekran görüntüsü 2024-12-24 100459](https://github.com/user-attachments/assets/5103f1ec-0609-4558-8381-20c9102b9980)






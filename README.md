# SpringbootProjects
let's build projects on springboot using spring data jpa.
### spring.data.jpa.hibernate.ddl-auto = update/validate/none/create/create-dropValue,Behavior,Recommended Environment
#### none = Does nothing. No changes are made to the database.,Production
#### validate = "Checks if the tables/columns match your entities. If not, the app fails to start.",Production / Staging
#### update = Only adds new columns or tables. It will not remove columns or change data types.,Development
#### create = Drops existing tables and creates new ones every time the app starts.,Testing
#### create-drop = Same as create, but also drops the tables when the app shuts down.

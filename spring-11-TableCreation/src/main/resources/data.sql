INSERT INTO EMPLOYEES(id, name)
VALUES (1, 'Mike'),(2, 'Smith');

INSERT INTO students(first_name, last_name, email)
VALUES ('Mike', 'Smith', 'mike@cydeo.com');


INSERT INTO students(first_name, last_name, email)
VALUES ('Tom', 'Hanks', 'tom@cydeo.com');

INSERT INTO employees(first_name, last_name, email)
VALUES ('Tom', 'Hanks', 'tom@cydeo.com');

Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.F, 2500);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26) Gender.F, 2500);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.F, 2500);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.M, 2500);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.M, 2500);

Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("Phones & Tablets", "Electronics");
        Department d5 = new Department("Computers", "Electronics");
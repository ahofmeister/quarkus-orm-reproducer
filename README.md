
- Adjust application.properties to an existing postgres connection
-  start the app with `mvn quarkus dev`
- hit `curl --request POST 'localhost:8080/events'`
- hit `curl --request PATCH 'localhost:8080/events'`
- See printed out SQL, only  one has changed (with getter/setter)



```
Hibernate: 
    select
        nextval ('hibernate_sequence')
Hibernate: 
    select
        nextval ('hibernate_sequence')
Hibernate: 
    insert 
    into
        Event
        (name, id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        EventWithGettersSetters
        (name, id) 
    values
        (?, ?)
Hibernate: 
    select
        event0_.id as id1_0_0_,
        event0_.name as name2_0_0_ 
    from
        Event event0_ 
    where
        event0_.id=?
Hibernate: 
    select
        eventwithg0_.id as id1_1_0_,
        eventwithg0_.name as name2_1_0_ 
    from
        EventWithGettersSetters eventwithg0_ 
    where
        eventwithg0_.id=?
Hibernate: 
    update
        EventWithGettersSetters 
    set
        name=? 
    where
        id=?
        ``

package org.example;

public record RecordExample(String name, int age) {

//    Some key differences between classes and records in Java include:
//            - Records automatically generate constructors, accessor methods, equals(), hashCode(), and toString() methods based on the fields defined in the record.
//            - Records cannot be extended or modified, as they are implicitly final and their fields are final and immutable.
//            - Records are intended for simple data transfer objects (DTOs) or data-holding classes, while classes can have more complex functionality and behavior.

    public static void main(String[] args) {
        RecordExample recordExample = new RecordExample("RecordExample", 18);

        System.out.println(recordExample.age);
        System.out.println(recordExample.name);
    }
}

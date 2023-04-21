package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Constructor;
import java.time.*;
import java.util.*;

@Document(collection = "tickets")
@Data// auto generates getters and setters
@AllArgsConstructor//auto generates constructors
@NoArgsConstructor//auto generates default constructor

public class ticket {
    private ObjectId projectID; //pair the ticket to the project
    private String issueTitle; //title the ticket
    private String[] status = {"To Do", "In Progress", "Done"}; //{To do, In Progress, Done}
    private String[] issueType = {"Functional Bug", "Visual Bug", "Usability Bug", "Performance Bug"}; //{Functional Bug, Visual Bug, Usability Bug, Perfomrance Bug}
    private LocalDate dateCreated; //will keep track of the date created
    private LocalDate dateCompleted; //this will keep track of the date the bug was addressed.    






    

    //toString
    @Override
    public String toString() {
        return "{" +
            " projectName='" + getProjectID() + "'" +
            ", issueTitle='" + getIssueTitle() + "'" +
//            ", status='" + getStatus() + "'" +
//            ", issueType='" + getIssueType() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            ", dateCompleted='" + getDateCompleted() + "'" +
            "}";
    }

     
}

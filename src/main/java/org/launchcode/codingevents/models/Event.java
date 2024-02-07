package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class Event extends AbstractEntity{
//    @Id
//    @GeneratedValue
//    private int id;
   // private static int nextId = 1;
    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    @Size(max = 500, message = "Description too long!")
    private String description;
    @NotBlank
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;
    @NotNull(message="Location cannot be left blank.")
    @NotBlank(message="Location cannot be left blank.")
    private String location;
    @AssertTrue(message="This event must have attendee register.")
    private boolean shouldRegister = true;
    @NotNull(message="Number of attendees must be one or more.")
    @Min(value=1,message="Number of attendees must be one or more.")
    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;
    @NotNull( message = "Must have number of food courses b/w 1 and 3")
    @Min(value = 1, message = "Must have number of food courses b/w 1 and 3")
    @Max(value = 3, message = "Must have number of food courses b/w 1 and 3")
    private int nmberOfFoodCourses;

    public Event(String name, String description,String contactEmail,String location,int numberOfAttendees) {
        this.name = name;
        this.description = description;
        this.contactEmail= contactEmail;
        this.location= location;
        this.numberOfAttendees=numberOfAttendees;
//        this.id = nextId;
//        nextId++;
    }
    public Event(){

    }

    public String getContactEmail() {
        return contactEmail;
    }

    public int getNmberOfFoodCourses() {
        return nmberOfFoodCourses;
    }

    public void setNmberOfFoodCourses(int nmberOfFoodCourses) {
        this.nmberOfFoodCourses = nmberOfFoodCourses;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public boolean isShouldRegister() {
        return shouldRegister;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public void setShouldRegister(boolean shouldRegister) {
        this.shouldRegister = shouldRegister;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public int getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }


}

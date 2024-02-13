package org.launchcode.codingevents.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


@Entity
public class Event extends AbstractEntity{
    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
//    @Size(max = 500, message = "Description too long!")
//    private String description;
//    @NotBlank
//    @Email(message = "Invalid email. Try again.")
//    private String contactEmail;
//    @NotNull(message="Location cannot be left blank.")
//    @NotBlank(message="Location cannot be left blank.")
//    private String location;
//    @AssertTrue(message="This event must have attendee register.")
//    private boolean shouldRegister = true;
//    @NotNull(message="Number of attendees must be one or more.")
//    @Min(value=1,message="Number of attendees must be one or more.")
//    @Positive(message="Number of attendees must be one or more.")
//    private int numberOfAttendees;
//    @NotNull( message = "Must have number of food courses b/w 1 and 3")
//    @Min(value = 1, message = "Must have number of food courses b/w 1 and 3")
//    @Max(value = 3, message = "Must have number of food courses b/w 1 and 3")
//    private int nmberOfFoodCourses;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventDetails eventDetails;
    @ManyToOne
    @NotNull(message = "Category is require")
    private EventCategory eventCategory;
    //private EventType type;

    public Event(String name, String description,String contactEmail,
                 EventCategory eventCategory) {

        this.name = name;
        this.eventCategory = eventCategory;

    }
    public Event(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }

}

//    public int getNmberOfFoodCourses() {
//        return nmberOfFoodCourses;
//    }
//
//    public void setNmberOfFoodCourses(int nmberOfFoodCourses) {
//        this.nmberOfFoodCourses = nmberOfFoodCourses;
//    }

//    public boolean isShouldRegister() {
//        return shouldRegister;
//    }
//
//    public int getNumberOfAttendees() {
//        return numberOfAttendees;
//    }
//
//    public void setNumberOfAttendees(int numberOfAttendees) {
//        this.numberOfAttendees = numberOfAttendees;
//    }
//
//
//    public void setShouldRegister(boolean shouldRegister) {
//        this.shouldRegister = shouldRegister;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

//    public int getId() {
//        return id;
//    }


Observer Readme

This code is a basic implementation of the visitor pattern.

Please use Main.java in this file to run my Demo.
>javaw Main.java
>java Main

Each Class is named after the role it is playing in the pattern for clarity.

Observer.java is an interface that shapes what an observer should look like.
    Update() is a uniform functions that is used to update what the observer is observing.
VisitationRecorder.java is an implementation of Observer and represents one of many classes that would be listening to our Subject.
Subject.java is an interface that shapes what the subject should look like.
    It also adds the features to help keep track of multiple observers.
    Attach() Adds multiple observers to a list inside of Subject.
    Notify() Makes a uniform method of telling observers to update().
CheckIn.java is an implementation of Subject. It features the tools to keep track of the Subjects Observers and Update them accordingly.

Use case, The pattern is good automatically handling events.
For example, something happens in the subject and that means we should kick off an event in the observer.
The observer will automatically be notified of the state change.

For the demo,
CheckIn will represent a check in system.
When a user checks in we will want to notify the Visitation Recorder which will be represented by VisitationRecorder.
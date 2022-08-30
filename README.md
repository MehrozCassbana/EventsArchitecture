# EventsArchitecture

The project is created for defining analytics layer. This project explain how we can define our rules in creating an analytics layer in a project. You need not expose all the events to all modules. Each module can have it's own analytics layer which takes info from core-analytics layer.
This is pretty flexible in case if management asks you to add a different analytics service, it will be very easy for the dev to add one more layer just by adding it into the dagger module.


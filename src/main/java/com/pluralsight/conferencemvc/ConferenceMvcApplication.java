package com.pluralsight.conferencemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceMvcApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceMvcApplication.class, args);
    }

}

/***
 * Model-View-Controller
 * Here is a standard MVC or model view controller design pattern that you may or may not have seen before.
 * A request comes through the view based off of some user event and then is interpreted by the controller.
 * The controller can change the model or not. And then it will select the view based off of our action.
 * From here, the model can update the view with the database off of the user's actions.
 * This graphic is sometimes confusing though because it's stemmed from rich client applications that were more event
 * based or using a design pattern called observer observable or a subscriber listener type design pattern. Not really
 * applicable to a lot of the software development we do with the web. This pattern in concept is still very sound,
 * but we usually don't have our model updating our view because it's gone to a page at that point, and it's
 * disconnected from our back end. This graphic though is a more accurate description of the kind of life cycle that we
 * may be faced with in web development. The graphic is realistically more like the life cycle that we see in our web
 * application. Our view can access our model, but it's usually done so through a controller. We'll look more at
 * lightweight approaches in the Ajax module later in this course. The summary is we usually make a request, even if
 * it's a lightweight request, through our controller to access our model. We don't have our view typically going
 * directly against our database or model.
 *
 * See src/main/resources/screenshots/MVC-diagram.jpg
 */
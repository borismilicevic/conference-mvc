Demo: View Configuration
Although not required, there's a convention of placing view pages under the WEB‑INF directory so that they cannot be
deep‑linked or bookmarked to. This way all requests must be directed through our application, and we can guarantee the
user experience. We already have this set up in our application. Let's look at what that configuration did for us,
though, and how it was tied to our application as far as deployments were concerned. When we converted our application
from a self‑contained executable JAR file to a WAR file that we deployed on Tomcat, we created a src main webapp
directory, and you can see that in our project structure over here on the left. Underneath that, we created a WEB‑INF
directory, a JSP directory, and that JSP directory contains the JSP files that we have created so far. Now, why would
we do this? As I mentioned, it's to make it so that people can't deep link to our application. And if I switch over to
my browser, we have our page that we've set up links to, but if you remember when we added these links, they were a
reference to the service call. So we were doing a call to the controller to route us back to the page that we wanted.
What happens if we come over here and we type in registration.jsp. It won't serve that up, and we don't want it to
serve that up. That's by design. So putting those pages underneath our WEB‑INF folder and a JSP folder makes it so that
they have to be served up internally and turned back to our end user, thus making it to where we control the state of
how they flow through the application, and they can't bookmark into things that we don't want them to. It's a lot better
designed for us. All we had to do was just move that under that WEB‑INF folder.
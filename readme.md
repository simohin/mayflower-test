# Getting Started

In the project root simply run

``docker compose up -d``

to stop

``docker compose down``

This will build the project and run it in a container with 8080 port exposed and embedded in memory database

Also it will run webhook cli in separate container for postback forwarding with default env
from [webhook.env](webhook.env)

Default configuration of application you can find in [application.yml](src%2Fmain%2Fresources%2Fapplication.yml)
Also there you can get default database console requisites

You can access database via http://localhost:8080/h2-console

Public api documentation available on http://localhost:8080/swagger-ui/index.html (postback api is excluded from this
doc)



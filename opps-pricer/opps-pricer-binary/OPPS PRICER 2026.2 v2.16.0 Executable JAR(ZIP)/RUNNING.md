# Using the Pricer

## System Requirements

To run the pricer application, you will need a Java 17 JDK.

## Running the Pricer Application

Prior to starting the pricer application, you will need to determine the following:

- The fully-qualified path to the pricer application JAR file
- The years for which you want to price claims

You can then use the following commands to start the pricer application.

- For Unix/Linux:

    ```shell
    export PRICER_YEARS=2019,2020,2021,2022,2023,2024,2025,2026
    export JAR_LOCATION=<path-to-jar>
    export COLUMNS=100

    java --add-opens java.base/java.lang=ALL-UNNAMED \
         -Ddw.supportedYears=$PRICER_YEARS \
         -Ddw.server.applicationConnectors\[0\].port=8080 \
         -jar $JAR_LOCATION server
    ```
- For Windows (Windows 10 and later)

    ```shell
    set PRICER_YEARS=2019,2020,2021,2022,2023,2024,2025,2026
    set JAR_LOCATION=<path-to-jar>
    set COLUMNS=100

    java --add-opens java.base/java.lang=ALL-UNNAMED ^
         -Ddw.supportedYears=%PRICER_YEARS% ^
         -Ddw.server.applicationConnectors[0].port=8080 ^
         -jar %JAR_LOCATION% server
    ```

## Accessing the Pricer Application

Once the pricer application is running, all access is via the REST API. You will need to create JSON files matching the schema for the `/price-claim` endpoint for each claim. These files can then be sent to the pricer application via `POST` request, and the response will be returned as JSON.

Here is an example of claim pricing using `cURL` as the client (`cURL` is available on Windows 10 and later). Any REST client (for example, [Postman](https://www.postman.com/)) can be used to interact with the pricer application.

```shell
curl -X POST http://localhost:8080/price-claim -H "Content-Type: application/json" -H "Accept: application/json" -d @<path-to-json-file>
```

### Accessing the OpenAPI Contract

The pricer application defines its contract as [OpenAPI](https://www.openapis.org/); see the [latest specification](https://spec.openapis.org/oas/latest.html) for more information on how to interpret the contract. You can also use the [Swagger Editor](https://editor.swagger.io/) to view the contract.

To access the OpenAPI contract for the pricer, use the following command (or any equivalent command via a REST client):

```shell
curl http://localhost:8080/openapi.json
```

You can use the contract at that URL to interact with the pricer locally via Swagger Editor or a similar contract renderer.

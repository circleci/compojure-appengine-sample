# Sample Compojure app with deployment to App Engine

[![CircleCI](https://circleci.com/gh/circleci/compojure-appengine-sample.svg?style=svg&circle-token=cdaa32c38ee9c803eeb886dfe1a059f641a4a22e)](https://circleci.com/gh/circleci/compojure-appengine-sample)

This sample Clojure app uses [Compojure
framework](https://github.com/weavejester/compojure) and gets deployed to
[Google App Engine](https://cloud.google.com/appengine/) via
[CircleCI Workflows](https://circleci.com/docs/2.0/workflows/).

## Running the app locally

You can start the app locally by running `docker-compose up -d` in the
repository root. The app will be available on the port `3000`.

## Pre-requisites

In your Google Cloud account, you will need to create a new project for this
app.

This example uses App Engine flexible environment, so within the project you
will also need a service account with the following permissions:

- App Engine Admin
- App Engine flexible environment Service Agent

To make sure that your workflow can authenticate correctly during the deployment
job, please add the JSON of your service account key as an encrypted environment
variable with the name `GCLOUD_KEY_JSON` in your CircleCI project.

## License

Copyright © 2017 Circle Internet Services

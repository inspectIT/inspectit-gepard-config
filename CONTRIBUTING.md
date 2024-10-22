# Contributing

## Formatting

We have [spotless](https://github.com/diffplug/spotless) configured to format the code. You can run the following commands:

- `./gradlew spotlessCheck` to validate the formatting of the code.
- `./gradlew spotlessApply` to format the code.

Be aware that the CI will fail if the code is not formatted correctly, as `spotlessCheck` is part of the build process.

## How to Release

## Remote

Everytime a tag is pushed, a release will be created for your current state.
The release will be stored in GitHub Packages.

Create a tag with: `git tag <tag>`

Push a tag with: `git push origin tag <tag>`

### Locally

For development, you might want to create a local release. For this you can run:

`./gradlew publishToMavenLocal -Pversion=<your-version>`

After that, you can use _inspectit-gepard-config_ as dependency in other projects by adding `repositories.mavenLocal()` 
into your project's `build.gradle`. 
Don't forget to use your specified local version in the `dependencies`.


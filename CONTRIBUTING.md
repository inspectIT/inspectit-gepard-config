# Contributing

## Formatting

We have [spotless](https://github.com/diffplug/spotless) configured to format the code. You can run the following commands:

- `./gradlew spotlessCheck` to validate the formatting of the code.
- `./gradlew spotlessApply` to format the code.

Be aware that the CI will fail if the code is not formatted correctly, as `spotlessCheck` is part of the build process.

## How to Release

Everytime a tag is pushed, a release will be created for your current state.
The release will be stored in GitHub Packages.

Create a tag with: `git tag <tag>`

Push a tag with: `git push origin tag <tag>`

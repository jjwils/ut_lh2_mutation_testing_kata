# ut_lh2_mutation_testing_kata

1. Run all the tests with coverage.  You should have all passing tests and 100% coverage.
2. However, there is still a problem.  Change the gradle build file to look like below

```groovy
plugins {
    id 'java'
    id 'info.solidsoft.pitest' version '1.15.0'
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}

test {
    useJUnitPlatform()
}

pitest {
    junit5PluginVersion = '1.0.0'    //or 0.15 for PIT <1.9.0
    targetClasses = ['train.the.trainer.*']
    targetTests = ['train.the.trainer.*']
    mutators = ['ALL']
}
```
3.  Reload the gradle project
4. Run a gradle verification task called pitest
5. Open the report
6. Find and fix the problem with the test
7. Now move onto branch step_3

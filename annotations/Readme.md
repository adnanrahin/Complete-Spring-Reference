### Spring Annotations
**@Component:** An annotation that allows Spring to automatically detect our custom beans. Instantiate them and inject any specified dependencies into them.
**@Qualifier:** During dependency injection we have multiple implementations of one single interface. We will not know which bean to inject, we can use ***@Qualifier*** to specify which bean to inject.

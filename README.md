# Material Compose Gallery


## Architecture

```mermaid
  graph TD;
      :app-->:feature:*;
      :app-->:data-impl;
      :feature:*-->:data;
      :data-impl-->:data;
```

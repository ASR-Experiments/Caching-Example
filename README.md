# Caching Example in Springboot

- Basically, demonstrates how we can cache the content in Springboot.

## Process

### Step 0: Boilerplate creation

#### Target
Setup for a basic JPA based Springboot application with all the required dependencies.

#### Mandatory steps
- Create a base project using [Spring initialzr](https://start.spring.io/)
  - `Spring Web` and `Spring Data JPA` is must.

#### Additional steps
- Added `Actuator`, `Lombok` and `Rest Repositories` for saving development time.
- Added ~~HAL Explorer~~ to view changes in GUI.

### Step 1: Base code

#### Target
Creation of base code which includes the creation of the basic Entity and related CRUD operations

#### Mandatory steps
- Added **Database Configuration** with required annotations like
  - `@EnableJpaRepositories`
  - `@Configuration`
- Adde `Product` entity and repository.

#### Additional Steps
- Replaced `HAL Explorer` by `Open API Docs` for UI and added its configuration.
- Added Documentation using Open API.
- Added Audit details for tracking changes.



## Sonar

### Badges
[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=ArvindSinghRawat_E-Commerce-Inventory)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)

### Stats

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=ArvindSinghRawat_E-Commerce-Inventory&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ArvindSinghRawat_E-Commerce-Inventory)

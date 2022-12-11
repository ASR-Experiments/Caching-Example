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
[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=ASR-Experiments_Caching-Example)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)

### Stats

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=ASR-Experiments_Caching-Example&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ASR-Experiments_Caching-Example)

# Cashfree Verification Java SDK
![GitHub](https://img.shields.io/github/license/cashfree/cashfree-verification-sdk-java) ![Discord](https://img.shields.io/discord/931125665669972018?label=discord) ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/cashfree/cashfree-verification-sdk-java/main) ![GitHub release (with filter)](https://img.shields.io/github/v/release/cashfree/cashfree-verification-sdk-java?label=latest) ![GitHub forks](https://img.shields.io/github/forks/cashfree/cashfree-verification-sdk-java) [![Coverage Status](https://coveralls.io/repos/github/cashfree/cashfree-verification-sdk-java/badge.svg?branch=main)](https://coveralls.io/github/cashfree/cashfree-verification-sdk-java?branch=main)

The Cashfree Verification Java SDK offers a convenient solution to access [Cashfree Verification APIs](https://docs.cashfree.com/reference/version-2) from a server-side Java  applications.



## Documentation

Cashfree's Verification API Documentation -https://docs.cashfree.com/reference/verification-api-overview


Try out our interactive guides at [Cashfree Dev Studio](https://www.cashfree.com/devstudio) !

## Getting Started

### Installation
* Gradle Project
```bash
implementation `com.cashfree.verification.java:cashfree_verification:2.0.8`
```
* Maven Project
```bash
<dependency>
  <groupId>com.cashfree.verification.java</groupId>
  <artifactId>cashfree_verification</artifactId>
  <version>2.0.8</version>
  <scope>compile</scope>
</dependency>
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>4.10.0</version>
</dependency>
```
### Configuration

```java 
import com.cashfree.*;

CashfreeVrs.XClientId = "<x-client-id>";
CashfreeVrs.XClientSecret = "<x-client-secret>";
CashfreeVrs.XEnvironment = CashfreeVrs.SANDBOX;

CashfreeVrs cashfree = new CashfreeVrs();
String xApiVersion = "2024-01-01";
```

Generate your API keys (x-client-id , x-client-secret) from [Cashfree Merchant Dashboard](https://merchant.cashfree.com/merchants/login)



## Licence

Apache Licensed. See [LICENSE.md](LICENSE.md) for more details

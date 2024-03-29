# Bank tech test

### Acceptance criteria

**Given** a client makes a deposit of 1000 on 10-01-2012
**And** a deposit of 2000 on 13-01-2012
**And** a withdrawal of 500 on 14-01-2012
**When** she prints her bank statement
**Then** she would see

```
date || credit || debit || balance
14/01/2012 || || 500.00 || 2500.00
13/01/2012 || 2000.00 || || 3000.00
10/01/2012 || 1000.00 || || 1000.00
```

#### User stories

```
As an Account owner,
So I can add money to my account,
I want to be able to deposit funds.
```

```
As an Account owner,
So I can access my money,
I want to be able to withdraw money from my account.
```

```
As an Account owner,
So I can check my in and out goings,
I want my account activity to be saved with the date of the transaction.
```

```
As an Account owner,
So I can keep track of my spending,
I want to be able to view my bank statement.
```

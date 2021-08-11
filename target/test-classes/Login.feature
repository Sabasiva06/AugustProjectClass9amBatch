Feature: Validating login of facebook application

  @reg
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

  @smoke 
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

  @sanity
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

  @sanity
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

  @Retest
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

  @E2E
  Scenario Outline: Validating login with invalid login and invalid password
    Given user is on facebook page
    When user enter "<username>" and "<password>"
    And user click login button

    Examples: 
      | username | password     |
      | hijavaa  | welcome      |
      | welcome  | welcome@123  |
      | selenium | Selenium@123 |

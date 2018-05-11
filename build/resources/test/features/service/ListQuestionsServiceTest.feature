Feature: List Questions service validations
#1
  Scenario: To verify if the service is able to authorize client on providing valid channelID and valid user credentials.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId     |  QuestionId  |
      | 1CUST         |              |
    Then the service returns successful response code 2XX


#@
  Scenario: To verify that the service returns data not found response on providing valid channelId and invalid questionId.
    Given the user has access to the listQuestionsCatalog service
    When the user requests the service with the below request body
      | ChannelId     |  QuestionId  |
      | 1CUST         |  XYZ         |
    Then the response message should be 'Data not found'

#3

  Scenario: To verify if the service returns unauthorized error on requesting with invalid user credentials.
    Given the listQuestionsCatalog service is up and running
    When  the user requests the service with the below details
      | ChannelId     |  QuestionId  |
      | 1CUST         |              |
    Then the service returns unauthorized error with response code 401


#4
  Scenario Outline: To verify that the service returns invalid value error on requesting with invalid channelId (Prerequisite : ChannelID shouldnt match with any branchID in database).
    Given the user has access to the listQuestionsCatalog service
    When the user requests the service with the below request body
      | ChannelId     |  QuestionId  |
      | <ChannelId>   |              |
    Then the service returns error response code as 4XX
    And  the response message should be 'Invalid channelId error'
    Examples:
      | ChannelId |
      | XYZ       |
      |           |
#5
  Scenario: To verify that the service returns request missing required value error on requesting with only questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      |  QuestionId  |
      |              |
    Then the service returns error response code as 4XX
    And  the response message should be 'Request missing required field: channelID'
#6
  Scenario: To verify that the service returns all data related to the questions on requesting with valid channelID (Prerequisite : ChannelID should match with any branchID in database).
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId |
      | 1CUST     |
    Then the service returns all data along with sucess response
    And  the response should return all data related to the questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#7
  Scenario: To verify that the service returns only the data related to a question on requesting with valid channelID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     | 12345      |
    Then the service returns only the data related to a question
    And  the response should return only the data related to a question
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#8
  Scenario: To verify that the service returns invalid value error on requesting with valid branchID as the channelId.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | BRANCH    | 12345      |
    Then the service returns error response code as 4XX
#9
  Scenario: To verify that the service returns all the question choices on requesting with valid channelID and questionID having choice as input type.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     | 12345      |
    Then the service returns success response code as 2XX
    And  the response should return all the question choices
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |401002,401003   | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |


#10
  Scenario: To verify that the service returns same choice twice when its related to two questions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     | 12345      |
    Then the service returns success response code as 2XX
    And  the response should return same choice twice when its related to two different questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |401002,401002   | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#11
  Scenario: To verify that the service is not returning duplicate questions on requesting with valid channelID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     | 12345      |
    Then the service returns success response code as 2XX
    And  the response should not return duplicate questions
#12
  Scenario: To verify that the service returns input list questions on requesting with valid channelID and valid questionId with type as input.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     | 12345      |
    Then the service returns success response code as 2XX
    And  the response should have the below fields
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     1,2       | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#13
  Scenario: To verify that the service returns input and choice type questions on requesting with valid channel ID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return input and choice type questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     1,2       | amount               |   number             |         12             |401002,401003   | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#14
  Scenario: To verify that the service returns multiple tips per single choice questions on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return multiple tips per single choice questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|6,101|       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#15
  Scenario: To verify that the service returns multiple tips with unique statuses per single choice questions on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return multiple tips with unique statuses per single choice questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|6,101|       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#16
  Scenario:To verify that the service returns single tip per multiple choice question on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return single tip per multiple choice question
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |401002,401003   | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#17
  Scenario:To verify that the service returns single tip per multiple choice question with status as OPEN on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return single tip per multiple choice question
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |401002,401003   | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#18
  Scenario: To verify that the service returns valid next questionID for each choice based questions on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return valid next questionID for each choice based questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#19
  Scenario: To verify that the service returns null as nextQuestionID for last choice based questions on requesting with valid channel ID and questionID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return null as nextQuestionID for last choice based questions
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|              |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#20
  Scenario:  To verify that the service returns same set of input based field for multiple questions on requesting with questionID having same input based field related to multiple questions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return same set of input based field for multiple questions
      |questionId   |questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |201011,202017| choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount,amount        |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#21
  Scenario: To verify that the service returns multiple sets of input fields for a question on requesting with questionID having multiple sets of input fields related to a question.    Given the user has access to the listQuestionsCatalog service
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return multiple sets of input fields for a question
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount,date          |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#22
  Scenario:To verify that the service returns valid call to action ids on requesting with valid channelID.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response return valid call to action ids
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#23
  Scenario:To verify that the service returns multiple call to actions associated to single tip on requesting with valid questionID having tip with multiple call to actions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return multiple call to actions associated to single tip
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3,4     |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#24
  Scenario: To verify that the service returns multiple call to actions associated to multiple tips on requesting with valid questionID having tips with multiple call to actions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return multiple call to actions associated to multiple tips
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|6,101|       |         |            |             |                 |    OPEN |      3,4     |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#25
  Scenario: To verify that the service returns single call to action which is associated to multiple tips on requesting with valid questionID having tips with same call to actions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return single call to action which is associated to multiple tips
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|6,101|       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |

#26
  Scenario: To verify that the service returns single call to action which is associated to single tip on requesting with valid questionID having tip with same call to actions.
    Given the user has access to the listQuestionsCatalog service
    When  the user requests the service with the below request body
      | ChannelId | QuestionId |
      | 1CUST     |            |
    Then the service returns success response code as 2XX
    And  the response should return single call to action which is associated to single tip
      |questionId|questionType|             questionText                         |nextQuestionId|questionHeaderId|             questionHeaderText                               |questionInputId|questionInputFieldName|questionInputFieldType|questionInputFieldLength|questionChoiceId|questionChoiceText      |tipId|tipText|tipHeader|tipSubHeader|tipDismissUrl|tipDismissUrlNmae|tipStatus|callToActionId|callToActionLinkName   |            callToActionUrlKey                         |imageName|
      |  201011  | choice     |Are you aware of credit optipons available to you?|  102013      |     501001     |A big event,sounds like fun I let's see what we can do to help|     2         | amount               |   number             |         12             |  401002        | I'm current on payments|  6  |       |         |            |             |                 |    OPEN |      3       |LearnAbout My Money Map|https://www.wellsfargo.com/online-banking/my-money-map/|         |



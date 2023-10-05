Feature: Individual cover for all Ages.

  Scenario Outline: Capture Individual cover for all Ages.
    Given A consultant is logged in to single GUI.
    And Select an Individual cover from product drop list.
    And Captures required details '<MainMemberTitle>','<MainMemberName>','<MainMemberSurname>','<MainMemberCellNumber>','<MainMemberSouthAfricanCitizen>','<MainMemberAge>','<MonthlyIncome>','<Occupation>','<Education>','<PostalAddress>','<PostalCode>'
    Examples:
      |MainMemberTitle|MainMemberName|MainMemberSurname|MainMemberCellNumber|MainMemberSouthAfricanCitizen|MainMemberAge|MonthlyIncome|Occupation|Education|PostalAddress|PostalCode|
Feature: Individual cover for all Ages.

  Scenario Outline: Capture Individual cover for all Ages.
    Given A consultant is logged in to single GUI.
    And Select an Individual cover from product drop list.
    And Captures required details '<Title>','<Name>'

    Examples:
      | Title | Name    |
      | Mr    | Ishmael |


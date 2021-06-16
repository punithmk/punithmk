#Sample test scenario which gives an example of API or Service level testing

@api
Feature: To verify the API


  Scenario Outline: verify the api respinse
    When I perform GET request for "/posts" endpoint
    Then I get a 200 http status code
    Then I get a "application/json; charset=utf-8" http contenttype
    Then I verify all the "<param>" with "<expected>"
    Examples:
      |param  |expected|
      |user_id|29, 29, 31, 32, 32, 33, 33, 34, 35, 36, 37, 38, 39, 40, 41, 41, 42, 42, 43, 45|
      |title  |Canonicus speculum capitulus aer et eaque caries pecto tolero bibo defessus taceo candidus tempus sublime cilicium desidero., Chirographum atrocitas bestia vulgivagus audio eaque valeo., Defleo ver optio animus creator carbo vel pecus comparo aestivus argentum voluptatem appello velum molestiae., Adaugeo tergeo auris vociferor tenax accusamus civis adultus cogito volva., Antiquus civis circumvenio clam armo alo aduro truculenter tergum in claro derideo adhaero vivo consequatur tabella deprimo., Quis atrox demitto uter aegre caecus ea cedo sustineo villa., Assumenda id tonsor demo illo delicate adsuesco absorbeo trans clam verbera., Degenero textus omnis arcus centum caste copia enim., Alo cimentarius tabgo et iusto optio tempore sint alter amaritudo dolorum rerum ratione speciosus conforto., Carmen umerus comedo vere aut decipio creber rerum comminor vado vomica acquiro absum acerbitas urbs victoria labore sollers uxor., Ducimus utrimque demum tollo commemoro pecus tendo temporibus appello., Demoror coadunatio valetudo non sponte curtus., Caput aequus audeo arcesso depulso tunc decor vomito adipiscor et dolore deleniti delectatio., Arto theatrum avoco ullus sono beatae vilicus est apto cibus pauper contego et strues certus vorago arca., Crur adnuo ventosus succurro ut subnecto voluptas caecus laborum venia amplexus benevolentia iusto., Fugit carcer thymum dolores dedico consequatur deripio ante alveus bene amplexus testimonium texo., Cupiditas ager creator conor ater cilicium nostrum enim sunt ver defungo vesica maiores arguo defigo ad timidus non., Abduco convoco consequatur cedo textor tempore triginta deputo., Cribro sonitus accusator amplitudo torqueo unde cubicularis sopor doloribus soleo deorsum vobis arbustum decumbo ustulo., Sophismata dapifer thymum theca blanditiis vetus credo cruciamentum cornu reiciendis conscendo subiungo terra.|





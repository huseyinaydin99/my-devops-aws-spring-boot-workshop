###  POST
http://localhost:8085/dynamodb


{
	"firstName": "Hüseyin",
	"lastName": "Aydın",
	"address": {
		"addressLinel": "Falan fıstık sokak",
		"addressLine2": "localhost:9999",
		"state": "Orta dünya",
		"city": "Niğde City cnm",
		"zipCode": "51200"
	},
	"age": "29"
}



###  GET
http://localhost:8085/dynamodb?studentId=ID_NUMBER&lastName=LAST_NAME


###  PUT
http://localhost:8085/dynamodb

{
    "studentId": "9999",
    "firstName": "Hüseyin",
    "lastName": "Aydın",
    "age": "45",
    "address": {
        "addressLine1": "Arka sokak",
        "addressLine2": "localhost mahallesi",
        "state": "Merkez",
        "city": "Niğde",
        "zipCode": "51200"
    }
}



###  DELETE çift anahtarlı yani range key yani hem id hemde ad anahtar kısmı.
http://localhost:8085/dynamodb/ID_numarasini_gir/Adini_gir


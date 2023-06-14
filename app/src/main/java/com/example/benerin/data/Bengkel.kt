package com.example.benerin.data

data class Bengkel(
    val idBengkel : String,
    val namaBengkel : String,
    val fotoUrl : String,
) {
}

data class ServiceKendaraan(
    val idService : String,
    val namaService : String,
    val fotoUrl : String,
){

}

object dataDummy{
    val dataBengkelDummy = listOf(
        Bengkel(
            "1",
            "Bengkel 1",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "2",
            "Bengkel 2",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "3",
            "Bengkel 3",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "4",
            "Bengkel 4",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "5",
            "Bengkel 5",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "6",
            "Bengkel 6",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "7",
            "Bengkel 7",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "8",
            "Bengkel 8",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "9",
            "Bengkel 9",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "10",
            "Bengkel 10",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "11",
            "Bengkel 11",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "12",
            "Bengkel 12",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "13",
            "Bengkel 13",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "14",
            "Bengkel 14",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "15",
            "Bengkel 15",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        )
    )

    val dataServiceDummy = listOf(
        ServiceKendaraan(
            "1",
            "Ganti Oli",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "2",
            "Ganti Rantai",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "3",
            "Ganti Busi",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "4",
            "Ganti Kabel Rem",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "5",
            "Ganti Filter Udara",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "6",
            "Ganti Aki",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "7",
            "Ganti Ban",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "8",
            "Ganti Kampas Rem",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "9",
            "Ganti Bearing Roda",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "10",
            "Ganti Lampu",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "11",
            "Ganti Karet Kaki",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "12",
            "Ganti Rem Cakram",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "13",
            "Ganti Karburator",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "14",
            "Ganti Kabel Gas",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        ),
        ServiceKendaraan(
            "15",
            "Ganti Velg",
            "https://www.speedwork.id/images/cara_ganti_oli.jpg"
        )
    )

    val dataBengkelFavoritesDummy = listOf(
        Bengkel(
            "1",
            "Bengkel 1",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "2",
            "Bengkel 2",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
        Bengkel(
            "3",
            "Bengkel 3",
            "https://magelangekspres.disway.id/upload/3cf2b10cd9d0fa795287810caf234a98.jpg"
        ),
    )
}
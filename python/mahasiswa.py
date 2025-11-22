class Mahasiswa:
    def __init__(self, nama, nim):
        self.__nama = nama
        self.__nim = None
        self.nim = nim

    @property
    def nama(self):
        return self.__nama

    @nama.setter
    def nama(self, value):
        self.__nama = value

    @property
    def nim(self):
        return self.__nim

    @nim.setter
    def nim(self, value):
        if value.isdigit() and len(value) == 10:
            self.__nim = value
        else:
            print("Data Mahasiswa")

m = Mahasiswa("Angeli Khairunissa", "32602400073")
print("Nama :", m.nama)
print("NIM  :", m.nim)

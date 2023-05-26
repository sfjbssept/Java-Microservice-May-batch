db.students.insertMany([
  {
    Name: "Philip",
    age: 33,
    position:"DEV"
  },
  {
    Name: "Roy",
    age: 32,
    position:"system arch"
  },
  {
    Name: "David",
    age: 39,
    position:"HR"
  },
  {
    Name: "Green",
    age: 22,
    position:"DB management"
  }
]);
db.student.find({Name: "Green", age: 22})
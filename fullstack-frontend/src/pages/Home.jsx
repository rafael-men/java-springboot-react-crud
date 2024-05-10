import React, { useEffect, useState } from 'react'
import axios from 'axios'

const Home = () => {

    const [users,setUsers] = useState([])

    useEffect(()=> {
        loadUsers()
    },[])

    const loadUsers = async () => {
        const result = await axios.get("http://localhost:8080/users")
        setUsers(result.data)
    }

  return (
    <div className='container'>
        <div className="py-4">
        <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Nome</th>
      <th scope="col">Nickname</th>
      <th scope="col">Email</th>
      <th scope='col'>Ações</th>
    </tr>
  </thead>
  <tbody>
    {
      users.map((user,index) => (
        <tr>
        <th scope="row" key={index}>{index+1}</th>
        <td>{user.name}</td>
        <td>{user.username}</td>
        <td>{user.email}</td>
        <td>
          <button className='btn btn-dark mx-2'>View</button>
          <button className='btn btn-warning mx-2'>Edit</button>
          <button className='btn btn-outline-danger mx-2'>Delete</button>
        </td>
      </tr>
      ))
    }
  </tbody>
</table>
        </div>
    </div>
  )
}

export default Home
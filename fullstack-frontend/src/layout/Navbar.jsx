import React from 'react'
import { Link } from 'react-router-dom'

const Navbar = () => {  
  return (
    <div>
      <nav className="navbar navbar-expand-lg bg-dark ">
  <div className="container-fluid">
    <a className="navbar-brand text-light ms-4" href="#">CRUD Fullstack</a>
  </div>
    <Link className="btn btn-light me-3" to="/adduser">Adicionar Usuário</Link>
     </nav>
  </div>
  )
}

export default Navbar
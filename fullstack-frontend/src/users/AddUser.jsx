import React, { useState } from 'react'

const AddUser = () => {

  const [user,setUser] = useState({
    name:"",
    username:"",
    email:""
  })

  const {name,username,email} =user

  const onInputChange = (e) => {

  }
  return (
    <div className='container'>
      <div className="row">
        <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
          <h2 className="text-center m-4">Registro de Usuário</h2>
          <div className="mb-3">
            <label htmlFor="Nome" className='form-label'>Nome</label>
            <input type={"text"} className='form-control' placeholder='Digite seu nome' value={name} onChange={(e)=> onInputChange(e)} />
          </div>
          <div className="mb-3">
            <label htmlFor="Nickname" className='form-label'>Nick</label>
            <input type={"text"} className='form-control' placeholder='Digite seu nickname' value={username}/>
          </div>
          <div className="mb-3">
            <label htmlFor="Email" className='form-label'>Email</label>
            <input type={"text"} className='form-control' placeholder='Digite seu nome' value={email} />
          </div>
          <button type="submit" className='btn btn-primary'>Enviar Dados</button>
          <button type="submit" className='btn btn-danger mx-2'>Cancel</button>
        </div> 
      </div>
    </div>
  )
}

export default AddUser
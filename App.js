import React, { Component } from 'react'
import Homecomponet from './Componet/homecomponet';

//import homecomponet from './Componet/homecomponet'
class Shop extends React.Component{  
  state={
    Homecomponet:[
      {name:"surafga",sex:"male"},
      {name:"surakaa",sex:"male"}
    ],
  } 
  handeler=()=>{
  this.setState({
    Homecomponet:[
      {name:"dagi",sex:"male"},
      {name:"surakaa",sex:"male"}
    ],
  })
  }
  nameHandeler=(event)=>{
    this.setState({
      Homecomponet:[
        {name:event.target.value,sex:"male"},
        {name:event.target.value,sex:"male"}
      ],
    })
    }
  render(){
    return (
      <div >

<Homecomponet name={this.state.Homecomponet[0].name} changed={this.nameHandeler}> the kokobe</Homecomponet>
   <Homecomponet name={this.state.Homecomponet[1].name} 
   changed={this.nameHandeler}> the kokobe</Homecomponet>

    </div>
    )
  }
}
export default Shop;
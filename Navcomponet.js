import React, { Component } from 'react'

class Navcomponet extends Component {
    

    render() {
        return (
            


  <nav class="navbar navbar-inverse">
      <div class="container">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
              </button>

              <a class="navbar-brand" href="#">SSEET</a><!-- //Logo -->

          </div>
          
          
          <div id="navbar" class="navbar-collapse collapse">

              <ul class="nav navbar-nav navbar-right">

                <li><a href="#about" class="scroll">About</a></li>
                <li><a href="#foreword" class="scroll">Foreword</a></li>

              
                <li role="presentation" class="dropdown carat1">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown<span class="caret"></span> </a>
                    <ul class="dropdown-menu dropdown1">
                <li><a href="#admissions" class="scroll">Admissions</a></li>
                      <li><a href="#alumnus" class="scroll">Alumnus</a></li>
                      <li><a href="#programs" class="scroll">Programs</a></li>
                      <li><a href="#services" class="scroll">Services</a></li>
                      <li><a href="#faculty" class="scroll">Faculty</a></li>
                      <li><a href="#edifice" class="scroll">Edifices</a></li>
                      <li><a href="#project" class="scroll">Projects</a></li>
                      <li><a href="#events" class="scroll">Events</a></li>
                    </ul>
                </li>
              
</ul>
</div>
</div>
</nav>
          

        )
    }
}

export default Navcomponet;
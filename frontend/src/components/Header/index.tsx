import logo from '../../assets/img/logo.svg'

import './style.css'

function Header() {
    return (
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a  target="_blank" href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig</a>
              <a target="_blank" href=""> e joaovq</a>
            </p>
        </div>
    </header>
    )
  }
  
  export default Header
  
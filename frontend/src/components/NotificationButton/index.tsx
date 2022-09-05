//  o ..(para voltar para pastas anteriores) faz voltar para a pasta assets. 
import icon from '../../assets/img/notification-icon.svg'
// mesma pasta é um único ponto
import './style.css'

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
        <img src={icon} alt="Notificar" />
      </div>
    )
  }
  
  export default NotificationButton
  
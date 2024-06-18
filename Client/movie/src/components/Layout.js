import { Outlet } from 'react-router-dom'


const layout = () => {
  return (
    <main>
        <Outlet />
    </main>
  )
}

export default layout
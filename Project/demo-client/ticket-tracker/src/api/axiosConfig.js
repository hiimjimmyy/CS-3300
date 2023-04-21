import axios from 'axios'

export default axios.create
({
    baseURL:'api.defaults.baseURL',
    headers: {}
})
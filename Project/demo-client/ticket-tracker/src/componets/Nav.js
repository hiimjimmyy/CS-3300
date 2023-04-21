import { Link } from "react-router-dom";
import button from 'bootstrap';
import * as React from 'react';
import Button from '@mui/material/Button';
import { useState } from 'react';
import CreateIssuesModal from "./CreateIssuesModal";

const Nav = () =>
{
    const [openCreateIssueModal, setOpenModal  ] = useState(false)
    return (
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Ticket Tracker</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                    <Button variant="contained" onClick={CreateIssuesModal()}>Create Issue</Button>{' '}

                    </div>
                </div>
            </div>
        </nav>
    )
}

export default Nav

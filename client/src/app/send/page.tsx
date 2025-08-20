"use client"
import { useState } from "react"

export default function SendPage(){
    const[file, setFile]= useState<File | null>(null);

    const handleSubmit= async()=>{
    if(!file) return alert("please select a file");

    const formData= new FormData();
    formData.append("file", file);
}

}


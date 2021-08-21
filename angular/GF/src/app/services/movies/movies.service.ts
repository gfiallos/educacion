import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {
  changeStatus(index: number) {
    this.data[index].status = !this.data[index].status;
    if (this.data[index].status) {
      this.data[index].voted= "btn btn-sm btn-dark";
    } else {
      this.data[index].voted= "btn btn-sm btn-outline-dark";
    }
  }

  constructor() { }
  data = [
    {
      img: "https://upload.wikimedia.org/wikipedia/en/f/ff/MI_–_Fallout.jpg",
      name: "Mission: Impossible - Fallout",
      description: "Ethan Hunt and his IMF team, along with some familiar allies, race against time after a mission gone wrong.",
      voted: "btn btn-sm btn-outline-dark",
      status:false
    },
        {
      img: "https://1.bp.blogspot.com/-LCyNIK03HgQ/YCYqggQOKsI/AAAAAAAA0mM/I1EdrnEn3Ikh4q-mrCDvJu2tad1tm4MWQCLcBGAsYHQ/s1500/MI5%2B00.jpg",
      name: "Mission: Impossible - Rogue Nation",
          description: "Ethan and his team take on their most impossible mission yet when they have to eradicate an international rogue organization as highly skilled as they are and committed to destroying the IMF.",
          voted: "btn btn-sm btn-outline-dark",
      status:false
    },
            {
      img: "https://upload.wikimedia.org/wikipedia/en/4/48/Mission_Impossible_II.jpg",
      name: "Mission: Impossible II",
              description: "IMF agent Ethan Hunt is sent to Sydney to find and destroy a genetically modified disease called Chimera.",
              voted: "btn btn-sm btn-outline-dark",
      status:false
    },
                    {
      img: "https://upload.wikimedia.org/wikipedia/en/b/b5/Mission_impossible_ghost_protocol.jpg",
      name: "Mission: Impossible - Ghost Protocol",
                      description: "The IMF is shut down when it's implicated in the bombing of the Kremlin, causing Ethan Hunt and his new team to go rogue to clear their organization's name.",
                      voted: "btn btn-sm btn-outline-dark",
      status:false
    }
  ];

}

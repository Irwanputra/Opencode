.class public abstract Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public ぇぬぎばつ:Z

.field public おぐぴう〸ず:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3047\u306c\u304e\u3070\u3064$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:I

.field public てぜきぽく:I

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Ljava/lang/CharSequence;

.field public びぐびあび:I

.field public へぬ〴づぞ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ぺぁあねじ:Ljava/lang/String;

.field public ぺふねづ〺:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    return-void
.end method


# virtual methods
.method public abstract 〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
.end method

.method public 〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ:I

    iput v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ:I

    iput v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->びぐびあび:I

    iput v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->づざかべべ:I

    iput v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    return-void
.end method

.method public abstract ぁごぐすすぃ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
.end method

.method public abstract くし〴〺ぅ()I
.end method

.method public abstract づざかべべ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
.end method

.method public abstract なぎぱいぢぎ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
.end method

.method public abstract びぐびあび()V
.end method

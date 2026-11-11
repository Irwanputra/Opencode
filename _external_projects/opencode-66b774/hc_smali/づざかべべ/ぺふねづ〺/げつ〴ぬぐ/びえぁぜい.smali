.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/ぁごぐすすぃ;


# instance fields
.field public 〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;
    .registers 2

    .line 1
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 2
    :cond_b
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-object v0
.end method

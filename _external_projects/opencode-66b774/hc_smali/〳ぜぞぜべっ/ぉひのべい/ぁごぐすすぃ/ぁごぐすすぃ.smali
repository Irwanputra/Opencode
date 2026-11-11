.class public final L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;
.super L〳ぜぞぜべっ/ぅみぱぎぎ;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final くし〴〺ぅ:J

.field public final びぐびあび:Lぺぁあねじ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLぺぁあねじ/ぁごぐすすぃ;)V
    .registers 5
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, L〳ぜぞぜべっ/ぅみぱぎぎ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;->〺つふすそ:Ljava/lang/String;

    iput-wide p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;->くし〴〺ぅ:J

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:Lぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method


# virtual methods
.method public じぜこほぱ()J
    .registers 3

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;->くし〴〺ぅ:J

    return-wide v0
.end method

.method public ぺづげぺが()Lぺぁあねじ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:Lぺぁあねじ/ぁごぐすすぃ;

    return-object v0
.end method

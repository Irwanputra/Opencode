.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Z

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I

.field public ぺぁあねじ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "LayoutState{mAvailable="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurrentPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mItemDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLayoutDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
